package project.management.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import project.management.config.ConnectionFatory;
import project.management.mapper.RowMapper;
import project.management.repository.GenericRepository;

public class AbstrachRepository<T> implements GenericRepository<T> {
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;


	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionFatory.getInstance().getConnection();
		return conn;
	}
	private void setParameter(PreparedStatement statement, Object... parameters) {
		try {
			for (int i = 0; i < parameters.length; i++) {
				Object parameter = parameters[i];
				int index = i + 1;
				if (parameter instanceof Integer) {
					statement.setLong(index, (Integer) parameter);
				} else if (parameter instanceof String) {
					statement.setString(index, (String) parameter);
				} else if (parameter instanceof Integer) {
					statement.setInt(index, (Integer) parameter);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters) {
		List<T> results = new ArrayList<>();
		try {
			connection = getConnection();
			ptmt = connection.prepareStatement(sql);
			setParameter(ptmt, parameters);
			resultSet = ptmt.executeQuery();
			while (resultSet.next()) {
				results.add(rowMapper.mapRow(resultSet));
			}
			return results;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (ptmt != null) {
					ptmt.close();
				}
				if (connection != null) {
					connection.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		
	}

	@Override
	public int update(String sql, Object... parameters) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(String sql, Object... parameters) {
		// TODO Auto-generated method stub
		return 0;
	}

}
