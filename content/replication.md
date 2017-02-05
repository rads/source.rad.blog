---
title: Replication
---

*noun*

> the action of copying or reproducing something.

## Table of Contents

- [Example](#example)
- [Introduction](#introduction)
- [Related Terms](#related-terms)
- [References](#references)
- [Implementations](#implementations)

## Example

This is replication.

This is replication.

This is replication.

## Introduction

If you've got something important you're better off making a copy sooner than later.

Many families make a copy of the master key for each person in the house. If Mom is at work, her kids can still get in the house without her when they return from school. That's because their slabs of metal all share the same shape. The idea of sharing a shape rather than a concrete representation shows up *everywhere* in programming.

Replication is an essential part of peer-to-peer networking. In an unreliable network it's impossible for one peer to always have an up-to-date copy of the other peers. Instead the peers must talk to one another to disseminate information across the network. This is called a [gossip protocol][gossip].

[gossip]: https://en.wikipedia.org/wiki/Gossip_protocol

## Related Terms

- Atomic Broadcast
- Content Addressing
- Content Hashing
- Discovery
- Distributed Systems
- Encryption
- Eventual Consistency
- Fault-Tolerance
- Gossip Protocols
- High Availability
- Merkle DAG
- Membership
- Messaging
- Networking
- Network Hole Punching
- Partial Order
- Peer-to-Peer
- State Machines
- TCP
- Total Order
- UDP

## References

- [*Epidemic Algorithms for Replicated Database Maintenance*](https://pdfs.semanticscholar.org/49ed/15db181c74c7067ec01800fb5392411c868c.pdf) (1987)
- [*Lightweight Probabalistic Broadcast*](http://perso.telecom-paristech.fr/~kuznetso/pubs/Lpbcast_tocs.pdf) (2003)
- [*Epidemic Broadcast Trees*](http://www.gsd.inesc-id.pt/~jleitao/pdf/srds07-leitao.pdf) (2007)
- [*HyParView: a membership protocol for reliable gossip-based broadcast*](http://asc.di.fct.unl.pt/~jleitao/pdf/dsn07-leitao.pdf) (2007)
- [*Efficient Reconciliation and Flow Control for Anti-Entropy Protocols*](https://www.cs.cornell.edu/home/rvr/papers/flowgossip.pdf) (2008)
- [*Strong Eventual Consistency and Conflict-free Replicated Data Types*](https://www.youtube.com/watch?v=ebWVLVhiaiY) (2011)
- [*A comprehensive study of Convergent and Commutative Replicated Data Types*](http://hal.upmc.fr/inria-00555588/document) (2011)
- [*EpTO: An Epidemic Total Order Algorithm for Large-Scale Distributed Systems*](http://haslab.uminho.pt/mmatos/files/p100-matos.pdf) (2015)
- [*Epidemic Algorithms for Log Sharing with Onyx*](https://www.dropbox.com/s/vs2gmpq32dtszwd/Project_Report_Sondre_Basma.pdf?dl=0) (2016)

## Implementations

- C
    - [MySQL](https://dev.mysql.com/doc/refman/5.7/en/replication.html)
    - [PostgreSQL](https://www.postgresql.org/docs/current/static/high-availability.html)
- Clojure
    - [Datomic](http://www.datomic.com/)
- Cloud
    - [Amazon Aurora](https://aws.amazon.com/rds/aurora/)
    - [Amazon DynamoDB](https://aws.amazon.com/dynamodb/)
    - [Google Cloud Datastore](https://cloud.google.com/datastore/)
    - [Google Cloud SQL](https://cloud.google.com/sql/)
    - [Microsoft Azure DocumentDB](https://docs.microsoft.com/en-us/azure/documentdb/documentdb-distribute-data-globally)
    - [Microsoft Azure SQL Database](https://docs.microsoft.com/en-us/azure/sql-database/sql-database-automated-backups)
    - [Microsoft Azure Table Storage](https://azure.microsoft.com/en-us/services/storage/tables/)
- Go
    - [IPFS](https://ipfs.io)
- Java
    - [HornetQ](https://docs.jboss.org/hornetq/2.4.0.Final/docs/user-manual/html/ha.html)
    - [Kafka](https://kafka.apache.org/documentation/#replication)
- JavaScript
    - [CouchDB](https://couchdb.apache.org/)
    - [hyperlog](https://github.com/mafintosh/hyperlog) ([Bliki](hyperlog))
    - [PouchDB](https://pouchdb.com/)
    - [scuttlebot](https://github.com/ssbc/scuttlebot) ([Bliki](scuttlebot))
    - [simple-scuttle](https://awinterman.github.io/simple-scuttle/)
