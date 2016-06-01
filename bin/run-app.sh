#!/usr/bin/env bash

function die {
    [ -n "$1" ] && echo "$1" >&2
    exit 1
}

script=$(basename $0)
cwd=$(cd $(dirname "$0") && pwd)
#[ $# -eq 0 ] || die "USAGE: ${script}"

root_dir=${cwd}/../
libs_dir=${root_dir}/build/runtime-libs
classes_dir=${root_dir}/build/classes/main
config_dir=${root_dir}/config

java -cp "${config_dir}:${classes_dir}:${libs_dir}/*" org.brasslock.StubApp "$@"

