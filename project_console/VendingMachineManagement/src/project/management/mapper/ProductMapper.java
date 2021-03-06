package project.management.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import project.management.entity.ProductEntity;

public class ProductMapper implements RowMapper<ProductEntity> {

	@Override
	public ProductEntity mapRow(ResultSet rs) {
		try {
			ProductEntity productEntity = new ProductEntity();
			productEntity.setId(rs.getInt("id"));
			productEntity.setName(rs.getString("name"));
			productEntity.setPrice(rs.getInt("prics"));
			productEntity.setTotal(rs.getInt("total"));
			productEntity.setStatus(rs.getInt("status"));
			return productEntity;
		} catch (SQLException e) {
			return null;
		}
	}

}
