package def;

import java.io.Serializable;

public class Bean implements Serializable{

	private String sikenn;
	
	private String ryoukinn;
	
	public String getSikenn() {
		return sikenn;
	}

	public void setSikenn(String sikenn) {
		this.sikenn = sikenn;
	}

	public String getRyoukinn() {
		return ryoukinn;
	}

	public void setRyoukinn(String ryoukinn) {
		this.ryoukinn = ryoukinn;
	}
	
}