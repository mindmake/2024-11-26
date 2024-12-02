package org.zerock.yang;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
import lombok.Getter;
*/
/*@Getter*/
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BuildVO {
	private String name;
	private int hp;
	private double mp;
	//객체생성시 이름은 필수고 필요에 따라 hp와 mp를 셋팅할수 있다.
	
	/*
	 * BuildVO(String name){ this.name=name; }
	 * 
	 * BuildVO(String name,int hp){ this.name=name; this.hp=hp; }
	 * 
	 * BuildVO(String name,Double mp){ this.name=name; this.mp=mp; }
	 * 
	 * BuildVO(String name,Double mp,int hp){ this.name=name; this.mp=mp;
	 * this.hp=hp; }
	 */
	
	/*
	 * private BuildVO() { }; //기본생성자 접근금지
	 * 
	 * //사용법 new BuildVO.Builder("aaa").SetHp(1) public static class Builder{
	 * private String name1; private int hp1; private double mp1;
	 * 
	 * public Builder(String name) { //이너클래스 기본생성자 this.name1=name; }
	 * 
	 * public void setHp(int hp1) { this.hp1=hp1; return this; } public void
	 * setMp1(double mp1) { this.mp1=mp1; return this; }
	 * 
	 * public BuildVO build() { BuildVO vo = new BuildVO(); vo.name=name1;
	 * vo.hp=hp1; vo.mp=mp1; return vo; } }
	 */
	
}
