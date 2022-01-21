package com.info.client;

import com.info.bookshelfservice.BookShelf;
import com.info.bookshelfservicestore.FurnitureStore;
import com.info.bookshelfservicestore.NYfurnitureStore;
import com.info.singleton.DeliveryService;

public class PurchaseBookShelf {

	public static void main(String[] args) {
		// Factory pattern to order book shelf
		FurnitureStore nyFurnitureStore = new NYfurnitureStore();
		BookShelf teakwoodShelf = nyFurnitureStore.createBookshelf("Teak");
		BookShelf plyWoodShelf = nyFurnitureStore.createBookshelf("Ply");

		// Deliver the cake using the singleton pattern
		System.out.println("****Deliver the shelf****");
		DeliveryService deliveryService = DeliveryService.getInstance();
		deliveryService.deliverBookShelf();

	}

}
