package exceptions;

public class Month {
	public int monthNumber;
    String month;
    
public Month() {
	
    }

public int getMonthNumber() {
	return monthNumber;
}

public void setMonthNumber(int monthNumber) throws Exception {
	if(monthNumber<13 && monthNumber>0) {
	this.monthNumber = monthNumber;
	}else { throw new Exception("There Ain't Such a Month");
		}
}

public String getMonth() {
	return month;
}

public void setMonth(String month) {
	this.month = month;
}

public String getMonthName(int monthNumber) {
	if (monthNumber==1) {
        month = "January";
    } else if (monthNumber==2) {
        month = "February";
    } else if (monthNumber==3) {
        month = "March";
    } else if (monthNumber==4) {
        month = "April";
    } else if (monthNumber==5) {
        month = "May";
    } else if (monthNumber==6) {
        month = "June";
    } else if (monthNumber==6) {
        month = "July";
    } else if (monthNumber==6) {
        month = "August";
    } else if (monthNumber==6) {
        month = "September";
    } else if (monthNumber==6) {
        month = "October";
    }else if (monthNumber==6) {
        month = "November";
    } else if (monthNumber==6) {
        month = "December";
    }
	return month;
	
}

}
