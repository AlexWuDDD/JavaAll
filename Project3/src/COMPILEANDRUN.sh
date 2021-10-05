#!/bin/bash

if [ $1 == "CLEAN" ]; then
    rm -rf com/alex/team/*/*.class
else
    rm -rf com/alex/team/*/*.class
    javac -d . com/alex/team/view/TeamView.java
    java com.alex.team.view.TeamView
fi