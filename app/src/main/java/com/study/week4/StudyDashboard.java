package com.study.week4;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class StudyDashboard {
    private static final String PERSONAL_KEY = "5564433fdea471e917cdff2327c68ffbf2164a1a";
    private GitHub github;
    private GHRepository repo;
    private List<GHIssue> issues;
    private List<GHIssueComment> comments;
    private HashSet<String> nameSet;
    private HashMap<String, Integer> commentMap;

    public StudyDashboard() throws IOException {
        github = new GitHubBuilder().withOAuthToken(PERSONAL_KEY).build();
        repo = github.getRepository("eogh234/live-study").getSource();
        nameSet = new HashSet<>();
        commentMap = new HashMap<>();

        issues = repo.getIssues(GHIssueState.ALL);
        for (GHIssue issue:issues) {
            comments = issue.getComments();
            nameSet = new HashSet<>();
            for (GHIssueComment comment : comments) {
                String name = comment.getUser().getName();
                if(name != null && !nameSet.contains(name)){
                    nameSet.add(name);
                    commentMap.put(name, commentMap.getOrDefault(name, 0) + 1);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        StudyDashboard dashboard = new StudyDashboard();
        dashboard.commentMap.forEach((name, count) -> System.out.printf("%s - %.2f%%\n", name, (count / (float)dashboard.issues.size() * 100)));
    }
}
