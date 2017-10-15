package test;

import select.selectSql;

public class test {
    public static  void main(String args[]){
        selectSql  selectSql = new selectSql();

        try{
           String name = selectSql.select();
           System.out.println(name);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
