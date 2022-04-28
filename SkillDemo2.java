public class SkillDemo2 {
    private int i;
	
	public SkillDemo2(){
        i = 0;
	}

	public void addI(int num){
		for (int k = 0; k < num; k++){
			i++;
        }	

	}
	public int getI(){
		return this.i;
	}

}
