package com.cloudesire.platform.apiclient.dto.model.dto.changelog;

import com.cloudesire.platform.apiclient.dto.model.dto.DTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ChangeLogDTO implements DTO
{
    private final List<CommitDTO> commits = new ArrayList<>();

    public List<CommitDTO> getCommits()
    {
        return commits;
    }

    public void addCommit( CommitDTO commit )
    {
        commits.add( commit );
    }

    public Optional<CommitDTO> getLastCommit()
    {
        if ( commits.isEmpty() ) return Optional.empty();

        return Optional.of( commits.get( commits.size() - 1 ) );
    }
}
