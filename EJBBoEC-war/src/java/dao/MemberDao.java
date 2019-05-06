/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import builder.Member;
import java.util.ArrayList;

/**
 *
 * @author taint
 */
public interface MemberDao {
    public boolean addMember(Member member);
//    public Member getMemberByName(String username);
    public ArrayList<Member> getAllMember();
    public void deleteMember(int id);
    public void updateMember(Member member);

    
}
