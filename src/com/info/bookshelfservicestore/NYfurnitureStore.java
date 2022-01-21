package com.info.bookshelfservicestore;

import com.info.bookshelfservice.BookShelf;
import com.info.bookshelfservice.PlyWoodBookShelf;
import com.info.bookshelfservice.TeakWoodShelf;

public class NYfurnitureStore extends FurnitureStore {

	@Override
	protected BookShelf createShelf(String type) {
		// TODO Auto-generated method stub
		if(type.equals("Teak")) {
			return new TeakWoodShelf();
		}
		else if(type.equals("Ply")) {
			return new PlyWoodBookShelf();
		}
		return null;
	}

}
