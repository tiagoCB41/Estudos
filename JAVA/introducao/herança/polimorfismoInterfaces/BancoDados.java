package com.introducao.heran�a.polimorfismoInterfaces;

public interface BancoDados extends SqlDCL,SqlDDL,SqlDML{
    void abrirConexao();
    void fecharConexao();
}
