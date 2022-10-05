
version-number  = 0.5.2
group-id        = io.zalky
artifact-id     = conformity
description     = Idempotent datom transacting for Datomic.\n\nSpecial thanks to Stuart Halloway for the original idea, implementation and permission to take it and run.
license         = :epl-1

include ../make-clj/Makefile

nuke: clean
	@echo "Nuking everything"
	@rm -rf .cpcache

clean:
	@echo "Cleaning target"
	@rm -rf target

