!#/bin/bash
cat storage/cryptowatch-assets-list.json | grep "urlTrade"| grep -oP "markets.*" | cut -d/ -f2 | sort | uniq -c | sort -r -g
