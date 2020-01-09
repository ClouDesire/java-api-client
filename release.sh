#!/bin/bash -eu
echo Releasing $VERSION and updating $NEXT_VERSION
./mvnw versions:set -DnewVersion=${VERSION} scm:checkin -Dmessage="Release $VERSION" -DgenerateBackupPoms=false
./mvnw scm:tag
./mvnw versions:set -DnewVersion=${NEXT_VERSION}-SNAPSHOT scm:checkin -Dmessage="Preparing for next iteration" -DgenerateBackupPoms=false
echo Finished!

echo Waiting to notify dependabot of the new release
sleep 120
echo curl -H "Authorization: Personal $GH_TOKEN" -d '{"name": "com.cloudesire.platform:cloudesire-api-client", "package-manager": "maven", "version": "'$VERSION'"}' -H "Content-Type:application/json" -X POST https://api.dependabot.com/release_notifications/private
