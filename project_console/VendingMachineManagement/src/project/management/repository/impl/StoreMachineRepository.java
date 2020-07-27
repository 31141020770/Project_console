package project.management.repository.impl;

import java.util.List;

import project.management.entity.StoreMachineEntity;
import project.management.mapper.StoreMachineMapper;
import project.management.repository.IStoreMachineRepository;

public class StoreMachineRepository extends AbstrachRepository<StoreMachineEntity> implements IStoreMachineRepository {

	@Override
	public List<StoreMachineEntity> findAll() {
		String sql = "SELECT * FROM storemachine";
		return query(sql, new StoreMachineMapper());
	}

	@Override
	public int add(StoreMachineEntity storeMachineEntity) {
		StringBuilder sql = new StringBuilder("INSERT INTO storemachine ");
		sql.append(" (name, address, userid)");
		sql.append(" VALUES(?, ?, ?)");
		return insert(sql.toString(), storeMachineEntity.getName(), storeMachineEntity.getAddress(), storeMachineEntity.getUserid());

	}

	@Override
	public void update(StoreMachineEntity storeMachineEntity) {
		StringBuilder sql = new StringBuilder("UPDATE storemachine ");
		sql.append(" SET name = ?, address = ?");
		sql.append(" WHERE id = ?");
		update(sql.toString(), storeMachineEntity.getName(), storeMachineEntity.getAddress());
		
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM storemachine WHERE id = ?";
		update(sql, id);	
	}
	
}
