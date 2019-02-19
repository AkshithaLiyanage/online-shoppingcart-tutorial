package net.kzn.shopingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shopingbackend.dao.CategoryDAO;
import net.kzn.shopingbackend.dto.Category;


@Repository("CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	static List<Category> categories = new ArrayList<Category>();
	
	static {
		//Creating first category 
		Category category = new Category();
		category.setId(1);
		category.setName("Mobile");
		category.setDescription("This is a category of Mobiles");
		category.setImageUrl("CAT_1.png");
		
		categories.add(category);
		//Creating second category
		category = new Category();
		category.setId(2);
		category.setName("Television");
		category.setDescription("This is a category of Televisions");
		category.setImageUrl("CAT_2.png");
		
		categories.add(category);
		//Creating third category
		category = new Category();
		category.setId(3);
		category.setName("Laptops");
		category.setDescription("This is a category of Laptops");
		category.setImageUrl("CAT_3.png");
		
		categories.add(category);
		
	}

	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
	

}
