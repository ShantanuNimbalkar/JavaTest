package javacodechecker;

public class AvoidThrowingGenericException {
    
    public void M1()throws Exception{
        logger.info("Throwing generic exception");
    }
    
    public void M2()throws Throwable{
        logger.info("Throwing generic exception");
    }
    
    public void M3()throws  InvocationTargetException{
        logger.info("Throwing InvocationTargetException");
    }

   
    public void M5()throws IOException, InvocationTargetException, SQLException{
        logger.info("Throwing IOException, InvocationTargetException, SQLException");
    }
    
    try{
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
      Statement stmt = con.createStatement(); {
         try(ResultSet rs = stmt.executeQuery("select * from MyPlayers");){
            //Retrieving the data
            while(rs.next()) {
            
            }
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }} catch (SQLException e) {
            e.printStackTrace();
      }
}
