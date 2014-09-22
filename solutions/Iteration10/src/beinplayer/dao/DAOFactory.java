package beinplayer.dao;


public class DAOFactory {

	private final static boolean isMock = false;
	
	public static TitreDAO getInstance(){
		if(isMock){
			return new TitreDAOMock();
		}else{
			return new TitreDAOImpl();
		}
	}
	
}
