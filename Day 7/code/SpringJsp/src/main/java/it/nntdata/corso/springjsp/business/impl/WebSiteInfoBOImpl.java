package it.nntdata.corso.springjsp.business.impl;

import it.nntdata.corso.springjsp.business.interfaces.WebSiteInfoBO;
import it.nntdata.corso.springjsp.model.WebSiteInfo;
import it.nntdata.corso.springjsp.repository.WebSiteInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
public class WebSiteInfoBOImpl implements WebSiteInfoBO {
    @Autowired
    WebSiteInfoRepository webSiteInfoRepository;
    @Autowired

    public WebSiteInfo getWebSiteInfo() throws DataAccessException{
        return webSiteInfoRepository.findFirstByOrderByIdDesc();
    }


}
