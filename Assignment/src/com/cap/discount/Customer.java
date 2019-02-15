package com.cap.discount;

public class Customer {
/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
	}
/**
	 * @return the member
	 */
	public boolean isMember() {
		return member;
	}
	/**
	 * @param member the member to set
	 */
	public void setMember(boolean member) {
		this.member = member;
	}
	/**
	 * @return the memberType
	 */
	public String getMemberType() {
		return memberType;
	}
	/**
	 * @param memberType the memberType to set
	 */
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
private String name;
private boolean member=false;
private String memberType;
Customer(String name)
{
	this.name=name;
}

}
