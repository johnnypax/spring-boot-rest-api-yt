package dev.archety.shool.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.mysql.cj.jdbc.MysqlDataSource;

import dev.archety.shool.models.Student;

@Repository
public class StudentRepository implements IRepositoryRead<Student>, IRepositoryWrite<Student>{

	private final DataSource ds;
	
	public StudentRepository(DataSource dataSource) {
		this.ds = dataSource;
	}
	
	@Override
	public List<Student> getAll() {
		
		List<Student> list = new ArrayList<Student>();
		
		try {
			Connection conn = ds.getConnection();
	
			String query = "SELECT studentID, firstName, lastName, studentNumber, dateOfBirth FROM Student";
			PreparedStatement ps = conn.prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Student stu = new Student();
				stu.setId( rs.getInt("studentID") );
				stu.setFirNam( rs.getString("firstName") );
				stu.setLasNam( rs.getString("lastName") );
				stu.setStuNum( rs.getString("studentNumber") );
				stu.setDateBr( rs.getDate("dateOfBirth") );
				
				list.add(stu);				
			}
			
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return list;
	}

	@Override
	public Student getById(int id) {
		Student stu = null;
		
		try {
			Connection conn = ds.getConnection();
			
			String query = "SELECT studentID, firstName, lastName, studentNumber, dateOfBirth "
					+ "FROM Student WHERE studentID = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				stu = new Student();
				stu.setId( rs.getInt("studentID") );
				stu.setFirNam( rs.getString("firstName") );
				stu.setLasNam( rs.getString("lastName") );
				stu.setStuNum( rs.getString("studentNumber") );
				stu.setDateBr( rs.getDate("dateOfBirth") );
			}
			
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return stu;
	}
	
	@Override
	public boolean Insert(Student obj) {
		boolean result = false;
		
		try {
			Connection conn = ds.getConnection();
			
			String query = "INSERT INTO Student (firstName, lastName, studentNumber, dateOfBirth) VALUES"
					+ "(?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, obj.getFirNam());
			ps.setString(2, obj.getLasNam());
			ps.setString(3, obj.getStuNum());
			ps.setDate(4, obj.getDateBr());
			
			int affRows = ps.executeUpdate();
			
			if(affRows > 0)
				result = true;
			
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return result;
	}

	@Override
	public boolean Update(Student obj) {
		boolean result = false;
		
		try {
			Connection conn = ds.getConnection();
			
			int id = obj.getId();
			Student stu = this.getById(id);
			
			if(stu != null) {
				stu.setFirNam( obj.getFirNam() == null ? stu.getFirNam() : obj.getFirNam() );
				stu.setLasNam( obj.getLasNam() == null ? stu.getLasNam() : obj.getLasNam() );
				stu.setStuNum( obj.getStuNum() == null ? stu.getStuNum() : obj.getStuNum() );
				stu.setDateBr( obj.getDateBr() == null ? stu.getDateBr() : obj.getDateBr() );
				
				String query = "UPDATE Student SET "
						+ "firstName = ?, "
						+ "lastName = ?, "
						+ "studentNumber = ?, "
						+ "dateOfBirth = ? "
						+ "WHERE studentID = ?";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, stu.getFirNam());
				ps.setString(2, stu.getLasNam());
				ps.setString(3, stu.getStuNum());
				ps.setDate(4, stu.getDateBr());
				ps.setInt(5, stu.getId());
				
				int affRows = ps.executeUpdate();
				
				if(affRows > 0)
					result = true;
			}		
			
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return result;
	}

	@Override
	public boolean Delete(int id) {
		boolean result = false;
		
		try {
			Connection conn = ds.getConnection();
			
			String query = "DELETE FROM Student WHERE studentID = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			
			int affRows = ps.executeUpdate();
			
			if(affRows > 0)
				result = true;
			
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return result;
	}
	
	public Student getByMatricola(String matr) {
		return null;
	}

}
