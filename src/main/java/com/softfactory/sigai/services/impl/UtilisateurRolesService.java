/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
/**
 * Spring serviceImpl "UtilisateurRoles"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class UtilisateurRolesService implements IUtilisateurRolesService {
	
	@Autowired
	UtilisateurRolesRepository utilisateurrolesRespository;
	
	@Override
	public UtilisateurRolesEntity getUtilisateurRolesById(Long idRole) {
		return utilisateurrolesRespository.getUtilisateurRolesBydId(idUtilisateurRoles);
	}

	@Override
	public List<UtilisateurRolesEntity> getAllUtilisateurRoless() {
		/* get all UtilisateurRoles*/
		return utilisateurrolesRespository.findAll();
	}

	@Override
	public UtilisateurRolesEntity addUtilisateurRoles(UtilisateurRolesDto utilisateurrolesDto) {
		/* add UtilisateurRoles */
		return utilisateurrolesRespository.save(UtilisateurRolesDto.dtoToEntity(UtilisateurRolesDto));
	}

	@Override
	public UtilisateurRolesEntity updateUtilisateurRoles(UtilisateurRolesDto utilisateurrolesDto) {
		/* update UtilisateurRoles*/
		return utilisateurrolesRespository.save(UtilisateurRolesDto.dtoToEntity(UtilisateurRolesDto));
	}

	@Override
	public void deleteUtilisateurRoles(Long idUtilisateurRoles) {
		/* delete UtilisateurRoles*/
		utilisateurrolesRespository.deleteById(idUtilisateurRoles);
	}
}