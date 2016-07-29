insert into FF4J_FEATURES(feat_uid, enable, description) values ('conditional-check',1,'conditional test');
insert into FF4J_FEATURES(feat_uid, enable, description) values ('screen-colour-feature',1,'screen color test');
insert into FF4J_FEATURES(feat_uid, enable, description, strategy, expression) values ('regulation-message',1,'screen color test','org.ff4j.strategy.ReleaseDateFlipStrategy','releaseDate=2016-07-27-17:12');
commit;