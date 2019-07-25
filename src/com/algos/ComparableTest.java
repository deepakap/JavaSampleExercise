/**
 * 
 */
package com.algos;

import java.util.ArrayList;

/**
 * @author deepa
 *
 */
public class ComparableTest implements Comparable<ComparableTest> {
	
	
	
	public Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public Integer points;
	public String teamName;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param id
	 * @param points
	 * @param teamName
	 */
	public ComparableTest(Integer id, Integer points, String teamName) {
		super();
		this.id = id;
		this.points = points;
		this.teamName = teamName;
	}

	
//	// sort by ID 
//	@Override
//	public int compareTo(ComparableTest o) {
//		if(this.getId()==o.getId())
//		{
//			return 0;
//		}else if(this.getId()<o.getId()){
//			return -1;
//		}else{
//			return 1;
//		}
//		
//		//return this.getId().compareTo(o.getId());
//	}
	
	
	
//	// sort by points 
//		@Override
//		public int compareTo(ComparableTest o) {
//			if(this.getPoints()==o.getPoints())
//			{
//				return 0;
//			}else if(this.getPoints()<o.getPoints()){
//				return -1;
//			}else{
//				return 1;
//			}
//			
//			//return this.getId().compareTo(o.getId());
//		}
		
		
		// sort by Team Name
				@Override
				public int compareTo(ComparableTest o) {
					if(this.getTeamName()==o.getTeamName())
					{
						return 0;
					}
					return this.getTeamName().compareTo(o.getTeamName());
					
					//return this.getId().compareTo(o.getId());
				}
	
	
	
	
	
	
	
	
	

}
