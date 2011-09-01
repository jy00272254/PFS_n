
public class GnereteSql {

	public static void main(String[] args) {
		String PPS_CONTRACT_TYPE = "0101,0102,0103,0104,0105,0106,0107,0108,0109,0110,0111,0112,0113,0114,0115,0116,0117,0118,0119,0120,0121,0122,0201,0202,0203,0204,0205,0206,0207,0208,0209,0210,0211,0212,0213,0214,0215,0216,0217,0218,0219,0220,0221,0222";
		String[] PPS_CONTRACT_TYPEs = PPS_CONTRACT_TYPE.split(",");
		
		String CHANNEL_TYPE = "01AAAAAA,02AAAAAA";
		String[] CHANNEL_TYPEs = CHANNEL_TYPE.split(",");
		
		String INNET_MONTH_LEVEL = "01,02,03,04,05,06,07,08,09,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60";
		String[] INNET_MONTH_LEVELs = INNET_MONTH_LEVEL.split(",");
		
		StringBuffer sql = new StringBuffer();
		
		for(int i=0; i<INNET_MONTH_LEVELs.length; i++){
			long ON_USER = Math.round(Math.random() * 20)+1;
			double source =  Math.random() * 300;
			String ALL_FEE = String.valueOf(source).substring(0,String.valueOf(source).lastIndexOf(".")+3);
			String PREPAY_FEE =  String.valueOf(source * 0.6).substring(0,String.valueOf(source * 0.6).lastIndexOf(".")+3);
		
			 sql.append("insert into REPORT.ZB_INCO_M_3G_10_08 values(");
			 sql.append("'201105'").append(","); //MONTH_NO
			 sql.append("'08'").append(",");//RECORD_TYPE
			 sql.append("'V0510100'").append(",");//CITY_NO
			 sql.append("'05'").append(",");//BRAND
			 sql.append("'").append(PPS_CONTRACT_TYPEs[i % PPS_CONTRACT_TYPEs.length]).append("'").append(",");//PPS_CONTRACT_TYPE
			 sql.append("'").append(CHANNEL_TYPEs[i % CHANNEL_TYPEs.length]).append("'").append(",");//CHANNEL_TYPE
			 sql.append("'").append(INNET_MONTH_LEVELs[i]).append("'").append(",");//INNET_MONTH_LEVEL
			 sql.append(ON_USER).append(",");//ON_USER
			 sql.append(Math.round(ON_USER * 0.1)).append(",");//NEW_USER
			 sql.append(Math.round(ON_USER * 0.8)).append(",");//ACCT_USER
			 sql.append(ALL_FEE).append(",");//ALL_FEE
			 sql.append(PREPAY_FEE).append(",");//PREPAY_FEE
			 sql.append(Math.round(ON_USER * 0.1));//OUTNET_USER
			 sql.append(");");
			 System.out.println(sql);
			 sql.delete(0, sql.length());
		}
		 
	}

}
