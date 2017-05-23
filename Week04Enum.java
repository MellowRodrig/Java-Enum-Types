package week04;

/**@author Brandon
 * @Date April 25, 2017
 * 
 *
 */

public enum Week04Enum {
	
		
		PACKERS ("Green Bay"),
		PATRIOTS ("Boston"),
		SEAHAWKS ("Seattle"),
		COWBOYS ("Dallas"),
		BILLS ("Buffalo"),
		BEARS ("Chicago"),
		STEELERS ("Pittsburgh"),
		CARDINALS ("Phoenix") ,
		BROWNS ("Cleveland"),
		GIANTS ("New York"),
		JETS ("New York"),
		FORTYNINERS ("San Francisco"),
		RAIDERS ("Oakland"),
		JAGUARS ("Jacksonville"),
		DOLPHINS ("Miami"),
		BRONCOS ("Denver"),
		TEXANS ("Houston"),
		RAVENS ("Baltimore"),
		REDSKINS ("Washington"),
		RAMS ("Los Angeles"),
		TITANS ("Tennessee"),
		VIKINGS ("Minneapolis"),
		LIONS ("Detroit"),
		COLTS ("Indianapolis"),
		BENGALS ("Cincinnati"),
		EAGLES ("Philadelphia"),
		CHIEFS ("Kansas City"),
		PANTHERS ("Charlotte"),
		BUCCANEERS ("Tampa Bay"),
		FALCONS ("Atlanta"),
		CHARGERS ("San Diego"),
		SAINTS ("New Orleans");
		
		private final String m_city;
		
		
		
		public String city()
		{
			return m_city;
		}
		
		/*
		 * @param city
		 */
		
		private Week04Enum(String city)
		{
			m_city = city;
		}
		
	}
