package movemethod;

public class User {
     /*
      * MotoDaoImpl motodao = new MotoDaoImpl();      
      * PlaneDaoImpl planedao = new PlaneDaoImpl();    
      * public void motoaction(){
      *   motodao.speed();
    	  motodao.cost();
      * }
      * 
      * public void planeaction(){
      *   planedao.speed();
    	  planedao.cost();
      * } 
      */

	MoveDao movedao;
      
      public User() {
    	  movedao = ChooseDao.getDao();
      }
      
      public MoveDao getDao() {
    	  return movedao;
      }
      
      public void setDao(MoveDao movedao) {
    	  this.movedao = movedao;
      }
      
      public void action() {
    	  movedao.speed();
    	  movedao.cost();
      }
}
