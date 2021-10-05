package com.alex.team.service;

import java.beans.DesignMode;
import java.text.BreakIterator;

import com.alex.team.domain.Architect;
import com.alex.team.domain.Designer;
import com.alex.team.domain.Employee;
import com.alex.team.domain.Programmer;

public class TeamService {
    
    private int counter = 1; //给memberId赋值使用
    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total; //记录开发团队中实际的人数

    public TeamService() {
        super();
    }

    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < total; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    public void addMember(Employee e) throws TeamException{
        if(total >= MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }
        if(!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        if(isExist(e)){
            throw new TeamException("该成员已在开发团队中");
        }

        Programmer p = (Programmer)e;
        if("BUSY".equals(p.getStatus().getNAME())){
            throw new TeamException("该成员已在开发团队中");
        }
        else if("VOCATION".equals(p.getStatus().getNAME())){
            throw new TeamException("该员正在休假，无法添加");
        }
    
        //获取team已有成员中架构师、设计师、程序员的人数
        int numOfArch = 0, numOfDes = 0, numOfPro = 0;
        for(int i = 0; i < total; i++){
            if(team[i] instanceof Architect){
                ++numOfArch;
            }
            else if(team[i] instanceof Designer) {
                ++numOfDes;
            }
            else if(team[i] instanceof Programmer){
                ++numOfPro;
            }
        }
        if(p instanceof Architect){
            if(numOfArch >= 1){
                throw new TeamException("团队中至多只能有一名架构师");
            }
        }
        else if(p instanceof Designer){
            if(numOfDes >= 2){
                throw new TeamException("团队中至多只能有两名设计师");
            }
        }
        else if(p instanceof Programmer){
            if(numOfPro >= 3){
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }

        team[total] = p;
        ++total;
        //p的属性赋值
        p.setStatus(Status.BUSY);
        p.setMemberid(counter++);
    }

    public void removeMember(int memberId) throws TeamException{
        int i = 0;
        for(;i < total; i++){
            if(team[i].getMemberid() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        if(i == total){
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }

        for(int j = i+1; j < total; ++j){
            team[j-1] = team[j];
        }
        team[total] = null;
        --total;
    }

    private boolean isExist(Employee e) {
        for (int i = 0; i < total; i++) {
            if(team[i].getId() == e.getId()){
                return true;
            }
        }
        return false;
    }
}
