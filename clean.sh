#!/bin/bash
find . -type f -name ".project" | xargs rm -f
find . -type f -name ".classpath" | xargs rm -f
find . -type d -name ".setting" | xargs rm -fr
