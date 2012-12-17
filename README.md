mvn-archetypes
==============

Simple maven archetypes for scala and akka projects.

To create a new Scala project:

```text
mvn archetype:generate -DarchetypeRepository=http://sstone.github.com/sstone-mvn-repo/snapshots -DarchetypeGroupId=com.aphelia -DarchetypeArtifactId=akka-simple-archetype -DarchetypeVersion=1.0-SNAPSHOT
```

To create a new Akka project:

```text
mvn archetype:generate -DarchetypeRepository=http://sstone.github.com/sstone-mvn-repo/snapshots -DarchetypeGroupId=com.aphelia -DarchetypeArtifactId=scala-simple-archetype -DarchetypeVersion=1.0-SNAPSHOT
```