package com.shop;

		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.PreparedStatement;
		import java.util.Scanner;

		public class ProductPriceUpdater {

		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter Product ID:");
		        int id = sc.nextInt();

		        System.out.println("Enter New Price:");
		        double price = sc.nextDouble();

		        try {
		            
		            Class.forName("com.mysql.cj.jdbc.Driver");

		            
		            Connection con = DriverManager.getConnection(
		                "jdbc:mysql://localhost:3306/shop",
		                "root",
		                "root"
		            );

		            
		            String query = "UPDATE products SET price = ? WHERE id = ?";

		            PreparedStatement pst = con.prepareStatement(query);
		            pst.setDouble(1, price);
		            pst.setInt(2, id);

		            int rows = pst.executeUpdate();

		            if (rows > 0) {
		                System.out.println("Product price updated successfully");
		            } else {
		                System.out.println("Product ID not found");
		            }

		            pst.close();
		            con.close();
		            sc.close();

		        } catch (Exception e) {
		            System.out.println("Error occurred");
		            e.printStackTrace();
		        }
		    }
		}

				