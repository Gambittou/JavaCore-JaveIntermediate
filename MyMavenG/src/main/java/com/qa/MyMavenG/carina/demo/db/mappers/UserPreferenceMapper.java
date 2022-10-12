package com.qa.MyMavenG.carina.demo.db.mappers;

import com.qa.MyMavenG.carina.demo.db.models.UserPreference;

public interface UserPreferenceMapper {

	void create(UserPreference userPreference);

	UserPreference findById(Long id);

}
