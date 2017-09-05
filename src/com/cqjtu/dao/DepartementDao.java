package com.cqjtu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.Paging;

import com.cqjtu.vo.Department;

import db.DBconnection;

public class DepartementDao {
	// �������ݿ�
	Connection con = DBconnection.getConnection();
	// 1.�������
	PreparedStatement pre = null;// �����ݿ�����ı���

	ResultSet res = null;// �������ֻҪ������ѯ�����ͱ���ʹ�ã�

	public ArrayList<Department> list = new ArrayList<Department>();

	public DepartementDao() {
		this.list.clear();
	}

	/**
	 * ��ȡԱ�����ܼ�¼��
	 * 
	 * @return ��ҳ����
	 */
	public Paging allCount() {
		String sql = "select count(*) from department";

		Paging paging = new Paging();

		try {
			pre = con.prepareStatement(sql);

			res = pre.executeQuery();

			while (res.next()) {
				paging.setCount(res.getInt(1));
//				System.out.println(res.getInt(1));
				return paging;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// ����ȫ������
	public void selectAll(int startNo, int pageNum) {
		String sql = "select * from department order by DepartmentID asc limit ?,?";

		try {
			pre = con.prepareStatement(sql);
			
			pre.setInt(1, startNo);
			pre.setInt(2, pageNum);

			res = pre.executeQuery();

			while (res.next()) {
				Department depart = new Department();
				depart.setDepartmentID(res.getInt("departmentID"));
				depart.setDepartmentName(res.getString("departmentName"));
				list.add(depart);
			}
			if (!con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// ����ȫ������
		public void selectAll() {
			String sql = "select * from department";

			try {
				pre = con.prepareStatement(sql);
				

				res = pre.executeQuery();

				while (res.next()) {
					Department depart = new Department();
					depart.setDepartmentID(res.getInt("departmentID"));
					depart.setDepartmentName(res.getString("departmentName"));
					list.add(depart);
				}
				if (!con.isClosed()) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	// ���ݲ���ID���Ҳ���
	public void departSelectId(int departId) {
		String sql = "select * from department where departId = ?";

		try {
			pre = con.prepareStatement(sql);

			pre.setInt(1, departId);

			res = pre.executeQuery();

			while (res.next()) {

				Department depart = new Department();
				depart.setDepartmentID(res.getInt(1));
				depart.setDepartmentName(res.getString(2));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	// ��Ӳ�����Ϣ
	public boolean addDepart(Department depart) {
		String sql = "insert into department (`DepartmentName`) values (?)";

		try {
			pre = con.prepareStatement(sql);

			pre.setString(1, depart.getDepartmentName());

			if (pre.executeUpdate() > 0) {

				return true;
			}
			return false;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	// �޸Ĳ�����Ϣ
	public boolean modifyDepart(Department depart) {
		String sql = "update department set DepartmentName = ? where DepartmentID = ?";

		try {
			pre = con.prepareStatement(sql);

			pre.setString(1, depart.getDepartmentName());
			pre.setInt(2, depart.getDepartmentID());

			if (pre.executeUpdate() > 0) {
				return true;
			}
			return false;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	// ɾ��������Ϣ
	public boolean delDepart(Department depart) {
		String sql = "delete from department where DepartmentId = ?";

		try {
			pre = con.prepareStatement(sql);

			pre.setInt(1, depart.getDepartmentID());

			if (pre.execute()) {
				return true;
			}

			return false;

		} catch (Exception e) {
		}
		return false;
	}
	
	/**
	 * ���ݲ�����������Ϣ
	 */
	public void departInfoN(String departmentName, int startNo, int pageNum) {
		String sql = "select * from department where DepartmentName like ? order by DepartmentName asc limit ?,?";

		departmentName = "%" + departmentName + "%";

		try {
			pre = con.prepareStatement(sql);

			pre.setString(1, departmentName);
			pre.setInt(2, startNo);
			pre.setInt(3, pageNum);

			res = pre.executeQuery();

			while (res.next()) {
				Department depart = new Department();
				depart.setDepartmentID(res.getInt("departmentID"));
				depart.setDepartmentName(res.getString("departmentName"));
				list.add(depart);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} 

	}
	
	/**
	 * ͳ�Ƹ��ݲ��������ҵļ�¼��
	 * @param departmentName
	 * @return
	 */
	public Paging DbyNCount(String departmentName) {
		String sql = "select count(*) from department where departmentName like ?";
		
		departmentName = "%" + departmentName + "%";
		
		Paging paging = new Paging();

		try {
			pre = con.prepareStatement(sql);
			pre.setString(1, departmentName);
			res = pre.executeQuery();

			while (res.next()) {
				paging.setCount(res.getInt(1));
				return paging;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
