package com.vg.userrolepermission.service.mapper;

import com.vg.userrolepermission.domain.SecurityPermission;
import com.vg.userrolepermission.service.dto.SecurityPermissionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link SecurityPermission} and its DTO {@link SecurityPermissionDTO}.
 */
@Mapper(componentModel = "spring")
public interface SecurityPermissionMapper extends EntityMapper<SecurityPermissionDTO, SecurityPermission> {}
