package task;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sms {

	public void addStudent(String id, String name, Integer roll_no, String branch, String room, String ph_no,String grade) throws SQLException {
		Connection con=null;
		PreparedStatement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/api","root","mysql");
			st=con.prepareStatement("insert into students values('"+id+"','"+name+"',"+roll_no+",'"+branch+"','"+room+"','"+ph_no+"','"+grade+"')");
			st.executeUpdate();
			System.out.println("Student Added");
		}
		catch (Exception e){
			System.out.println("Error occured" +e);
		}
		finally {
			st.close();
			con.close();
		}
		
	}
	public void updateStudent(String id, String name, Integer roll_no, String branch, String room, String ph_no,String grade) throws SQLException {
		Connection con=null;
		PreparedStatement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/api","root","mysql");
			st=con.prepareStatement("update students set name='"+name+"',roll_no="+roll_no+", room='"+room+"',ph_no="+ph_no+",grade='"+grade+"' where id="+id+"");
			st.executeUpdate();
		 	System.out.println("Student Updated");
		}
		catch (Exception e){
			System.out.println("Error occured" +e);
		}
		finally {
			st.close();
			con.close();
		}
	}

	public void removeStudent(String id ) throws SQLException {
		Connection con=null;
		PreparedStatement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/api","root","mysql");
			st=con.prepareStatement("delete from students where id='"+id+"'");
			st.executeUpdate();
			System.out.println("Student Deleted");
		}
		catch (Exception e){
			System.out.println("Error occured" +e);
		}
		finally {
			st.close();
			con.close();
		}
		
	}

	public void searchStudent(String id) throws SQLException {
		Connection con=null;
		PreparedStatement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/api","root","mysql");
			System.out.println(id);
			st=con.prepareStatement("select * from students where id='"+id+"'");
			ResultSet rs=st.executeQuery();
			if(rs.next()) {
				System.out.println("ID Number:"+rs.getString("id")+" Name:"+rs.getString("name")+" Roll Number:"+rs.getInt("roll_no")+" Branch:"+rs.getString("branch")+" Class Room:"+rs.getString("room")+" Phone Number:"+rs.getString("ph_no")+" Grade: "+rs.getString("grade"));
			}
			else {
				System.err.println("No data found");
			}
		}
		catch (Exception e){
			System.out.println("Error occured" +e);
		}
		finally {
			st.close();
			con.close();
		}
		
	}

	public void getStudents() throws SQLException {
		Connection con=null;
		PreparedStatement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/api","root","mysql");
			st=con.prepareStatement("select * from students");
			ResultSet rs=st.executeQuery();
			if(rs.next()) {
				System.out.println("ID Number:"+rs.getString("id")+" Name:"+rs.getString("name")+" Roll Number:"+rs.getInt("roll_no")+" Branch:"+rs.getString("branch")+" Class Room:"+rs.getString("room")+" Phone Number:"+rs.getString("ph_no")+" Grade: "+rs.getString("grade"));
				while(rs.next()) {
					System.out.println("ID Number:"+rs.getString("id")+" Name:"+rs.getString("name")+" Roll Number:"+rs.getInt("roll_no")+" Branch:"+rs.getString("branch")+" Class Room:"+rs.getString("room")+" Phone Number:"+rs.getString("ph_no")+" Grade: "+rs.getString("grade"));
				}
			}
			else {
				System.err.println("No data");
			}
		}
		catch (Exception e){
			System.out.println("Error occured" +e);
		}
		finally {
			st.close();
			con.close();
		}
		
	}

}