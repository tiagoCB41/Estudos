package com.introducao.heran�a.polimorfismoInterfaces;

public interface SqlDDL {
    void create(String query);
    void alter(String query);
    void drop(String query);
}
