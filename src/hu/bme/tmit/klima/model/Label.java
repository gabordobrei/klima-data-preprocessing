package hu.bme.tmit.klima.model;

public class Label {
	private int code;
	private String text;
	
	public Label(int code, String text){
		this.code = code;
		this.text = text;
	}
	
	public Label(int code){
		this.code = code;
	}
	
	public Label(String text){
		this.text = text;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
