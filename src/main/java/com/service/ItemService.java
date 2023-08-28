package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Item;
import com.repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	ItemRepository itemRepository;
	
	public void addItem(Item item)
	{
		itemRepository.save(item);
	}
	public void updateItem(Item item)
	{
		itemRepository.save(item);
	}
	public void deleteItem(Item item)
	{
		itemRepository.save(item);
	}
	public List<Item> getAllItems()
	{
		ArrayList<Item> itemlist=new ArrayList();
		return itemRepository.findAll();
				
	}
	public Item getItemById(int id)
	{
		return itemRepository.findById(id).get();
	}
	

}
