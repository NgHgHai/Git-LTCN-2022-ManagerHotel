package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import model.ARoom;
import model.AType;
import model.Account;
import model.CheckIn;
import model.HotelManager;
import view.Login;

public class Controller {
	private HotelManager manager;
	private Login login;

	public Controller(HotelManager manager) {
		super();
		this.manager = manager;
		login = new Login(manager, this);
		login.setVisible(true);

	}
	public int totalRoom() {
		return manager.totalRoom();
	}
	public Set<ARoom> getRooms() {
		return manager.getRooms();
	}
	public boolean isAccout(String name, String pass) {

		return manager.isAccount(name, pass);
	}

	public boolean addAccount(String name, String pass, boolean selected) {

		return manager.addAccount(name, pass, selected);
	}

	public boolean removeAccount(String name) {

		return manager.removeAccount(name);
	}

	public boolean addRoom(String id, String name, String roomState, double cost, boolean available, String type,
			int capacity) {
		return manager.addRoom(id, name, roomState, cost, available, type, capacity);
	}

	public boolean removeRoom(String name) {

		return manager.removeRoom(name);
	}

	public String search(String roomType, int roomCapacity) {
		// TODO Auto-generated method stub
		return manager.searchModel(roomType, roomCapacity);

	}

	public boolean saveCheckIn(String name, String phone, String email, String address, String city, String nationality,
			String passsport, String cardNumber, String codeCVC, String roomType, int roomCapacity, Date checkInDate,
			Date checkOutDate, String roomID) {
		return manager.saveCheckInModel(name, phone, email, address, city, nationality, passsport, cardNumber, codeCVC,
				roomType, roomCapacity, checkInDate, checkOutDate, roomID);

	}
	public Account getUser() {
		
		return manager.getUser();
	}

	public CheckIn checkOut(String iDCheckOut) {
		// TODO Auto-generated method stub
		return manager.checkOut(iDCheckOut);
	}
	public CheckIn getCheckIn() {
		return manager.getCheckIn();
	}
	public ArrayList<CheckIn> removeCheckIn(ArrayList<CheckIn> listCheckIn) {
		// TODO Auto-generated method stub
		return manager.removeCheckIn(listCheckIn);
	}
}
