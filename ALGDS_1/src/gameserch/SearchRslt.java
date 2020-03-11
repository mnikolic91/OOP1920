package gameserch;

public class SearchRslt {

	int indx = -1;
	boolean status = false;
	int value;

	public SearchRslt(int indx, int val) {
		this.indx = indx;
		this.value = val;
		status = true;

	}

	public SearchRslt(int val) {
		value = val;
	}

	public int getIndx() {
		return indx;
	}

	public boolean isStatus() {
		return status;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "SearchRslt [indx=" + indx + ", status=" + status + ", value=" + value + "]";
	}

}
