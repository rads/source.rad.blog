---
title: Replication
---

*noun*

> the action of copying or reproducing something.

## Example

This is replication.

This is replication.

This is replication.

## Introduction

If you've got something important you're better off making a copy sooner than later.

Many families make a copy of the master key for each person in the house. If Mom is at work, her kids can still get in the house without her when they return from school. That's because their slabs of metal all share the same shape. The idea of sharing a shape rather than a concrete representation shows up *everywhere* in programming.

Replication is an essential part of peer-to-peer networking. In an unreliable network it's impossible for one peer to always have an up-to-date copy of the other peers. Instead the peers must talk to one another to disseminate information across the network. This is called a [gossip protocol][gossip].

[gossip]: https://en.wikipedia.org/wiki/Gossip_protocol

## References

- [*Epidemic Algorithms for Replicated Database Maintenance*](https://pdfs.semanticscholar.org/49ed/15db181c74c7067ec01800fb5392411c868c.pdf) (1987)
- [*Efficient Reconciliation and Flow Control for Anti-Entropy Protocols*](https://www.cs.cornell.edu/home/rvr/papers/flowgossip.pdf) (2008)
- [*Strong Eventual Consistency and Conflict-free Replicated Data Types*](https://www.youtube.com/watch?v=ebWVLVhiaiY) (2011)
- [*A comprehensive study of Convergent and Commutative Replicated Data Types*](http://hal.upmc.fr/inria-00555588/document) (2011)

## Implementations

- Cloud
    - [Amazon Aurora](https://aws.amazon.com/rds/aurora/)
    - [Amazon DynamoDB](https://aws.amazon.com/dynamodb/)
- C
    - [PostgreSQL](https://www.postgresql.org/docs/current/static/high-availability.html)
- Go
    - [IPFS](https://ipfs.io)
- Java
    - [HornetQ](https://docs.jboss.org/hornetq/2.4.0.Final/docs/user-manual/html/ha.html)
    - [Kafka](https://kafka.apache.org/documentation/#replication)
- JavaScript
    - [CouchDB](https://couchdb.apache.org/)
    - [hyperlog](https://github.com/mafintosh/hyperlog)
    - [PouchDB](https://pouchdb.com/)
    - [secure-scuttlebutt](https://github.com/dominictarr/secure-scuttlebutt)
    - [simple-scuttle](https://awinterman.github.io/simple-scuttle/)
