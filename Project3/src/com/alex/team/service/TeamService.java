package com.alex.team.service;

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

        if("VOCATION".equals(p.getStatus().getNAME())){
            throw new TeamException("该员正在休假，无法添加");
        }
        
    }

    public void removeMember(int memberId) throws TeamException{

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
