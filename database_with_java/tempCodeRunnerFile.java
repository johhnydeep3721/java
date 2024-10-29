 // String insertSQL = "insert into custemer_table(CustumerName, ContactName, Address, City, PostalCode, Country)  VALUES (?, ?, ?, ?, ?, ?)";
        // try{
        //     Connection connection = DriverManager.getConnection(url, username, password);
        //     PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
        //     Scanner scanner = new Scanner(System.in);
        //     System.out.println("input custumers name: ");
        //     String CustumerName = scanner.nextLine();
        //     System.out.println("int Contact name: ");
        //     String ContactName = scanner.nextLine();
        //     System.out.println("input Address: ");
        //     String Address = scanner.nextLine();
        //     System.out.println("input City: ");
        //     String City = scanner.nextLine();
        //     System.out.println("input postalCode: ");
        //     String PostalCode = scanner.nextLine();
        //     System.out.println("input Contry: ");
        //     String Contry = scanner.nextLine();

        //     preparedStatement.setString(1, CustumerName);
        //     preparedStatement.setString(2, ContactName);
        //     preparedStatement.setString(3, Address);
        //     preparedStatement.setString(4, City);
        //     preparedStatement.setString(5, PostalCode);
        //     preparedStatement.setString(6, Contry);
        //     // System.out.println("Connect successful");
        //     // connection.close();
        //     int rowInserted = preparedStatement.executeUpdate();
        //     if(rowInserted > 0){
        //         System.out.println("A new user updated");
        //     }

        // }catch(SQLException e){
        //     e.printStackTrace();
        // }