#!/bin/bash -exu
echo Releasing $VERSION and updating $NEXT_VERSION
./mvnw versions:set -DnewVersion=${VERSION} scm:checkin -Dmessage="Release $VERSION" -DgenerateBackupPoms=false
./mvnw scm:tag
./mvnw versions:set -DnewVersion=${NEXT_VERSION}-SNAPSHOT scm:checkin -Dmessage="Preparing for next iteration" -DgenerateBackupPoms=false
echo Finished!
