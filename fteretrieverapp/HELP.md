#Inserting record in FTECount
#-----------------------------
use testdb
db.FTECount.insert({_id:0,track:"BM",fteCount:10})
db.FTECount.insert({_id:1,track:"ARDC",fteCount:13})
db.FTECount.insert({_id:2,track:"CO",fteCount:19})