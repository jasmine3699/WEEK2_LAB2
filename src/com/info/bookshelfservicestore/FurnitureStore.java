package com.info.bookshelfservicestore;

import com.info.bookshelfservice.BookShelf;

public abstract class FurnitureStore {
	
	
	public BookShelf createBookshelf(String type) {
		
		BookShelf bookShelf = createShelf(type);
		bookShelf.selectModel();
		bookShelf.costOfBookShelf();
		bookShelf.orderBookShelf();
		
		return bookShelf;
		
	}

	protected abstract BookShelf createShelf(String type);

}
