package App19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JdbcAPP {
    public static void main(String[] args) throws Exception{
            Class.forName("oracle:jdbc:Oracledriver");
            Connection con=DriverManager.getConnection("oracle:jdbc:thin:@localhost:1541:xe");
            //Statement std=con.createStatement();
            //std.addBatch("insert into emp values(111,'AAA',5000,'ooty'");
            //std.addBatch("delete * from emp");
            //std.executeBatch();
            //std.close();
        PreparedStatement pstd=con.prepareStatement("insert into emp1 values(?,?,?,?)");
        pstd.setInt(1,111);
        pstd.setString(1,"aaaa");
        pstd.setInt(1,50000);
        pstd.setString(1,"chennai");
        pstd.executeBatch();
        pstd.close();
        con.close();
    }
}
