package project.management.service.impl;

import project.management.entity.OrderItemEntity;
import project.management.repository.IOrderItemRepository;
import project.management.repository.impl.OrderItemRepository;
import project.management.service.IOrderItemService;

public class OrderItemService implements IOrderItemService{
	IOrderItemRepository orderItemRepository = new OrderItemRepository();
	@Override
	public OrderItemEntity addOrderItem( OrderItemEntity orderItemEntity) {
		int newId = orderItemRepository.add( orderItemEntity);
		return orderItemRepository.findOne(newId);
	}

}
