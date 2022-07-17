package com.introducao.herança.polimorfismoInterfaces;

public interface BancoDados extends SqlDCL,SqlDDL,SqlDML{
    void abrirConexao();
    void fecharConexao();
}
