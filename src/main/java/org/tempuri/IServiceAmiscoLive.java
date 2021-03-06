
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.livemediastructs.ActorStruct;
import org.datacontract.schemas._2004._07.livemediastructs.ArrayOfDayRankingStruct;
import org.datacontract.schemas._2004._07.livemediastructs.ArrayOfDayScoringStruct;
import org.datacontract.schemas._2004._07.livemediastructs.ArrayOfMatchFilActionLightStruct;
import org.datacontract.schemas._2004._07.livemediastructs.ArrayOfMatchFilActionStruct;
import org.datacontract.schemas._2004._07.livemediastructs.ArrayOfMatchLightStruct;
import org.datacontract.schemas._2004._07.livemediastructs.ArrayOfMatchStruct;
import org.datacontract.schemas._2004._07.livemediastructs.MatchFilActionStruct;
import org.datacontract.schemas._2004._07.livemediastructs.MatchStruct;
import org.datacontract.schemas._2004._07.livemediastructs.TeamStruct;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IServiceAmiscoLive", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.arrays.ObjectFactory.class,
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    org.datacontract.schemas._2004._07.livemediastructs.ObjectFactory.class,
    org.tempuri.ObjectFactory.class
})
public interface IServiceAmiscoLive {


    /**
     * 
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "IsReady", action = "http://tempuri.org/IServiceAmiscoLive/IsReady")
    @WebResult(name = "IsReadyResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "IsReady", targetNamespace = "http://tempuri.org/", className = "org.tempuri.IsReady")
    @ResponseWrapper(localName = "IsReadyResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.IsReadyResponse")
    public Boolean isReady();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ServiceVersion", action = "http://tempuri.org/IServiceAmiscoLive/ServiceVersion")
    @WebResult(name = "ServiceVersionResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ServiceVersion", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ServiceVersion")
    @ResponseWrapper(localName = "ServiceVersionResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ServiceVersionResponse")
    public String serviceVersion();

    /**
     * 
     * @return
     *     returns com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring
     */
    @WebMethod(operationName = "GetMatchStructDetailAvailable", action = "http://tempuri.org/IServiceAmiscoLive/GetMatchStructDetailAvailable")
    @WebResult(name = "GetMatchStructDetailAvailableResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetMatchStructDetailAvailable", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetMatchStructDetailAvailable")
    @ResponseWrapper(localName = "GetMatchStructDetailAvailableResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetMatchStructDetailAvailableResponse")
    public ArrayOfKeyValueOfintstring getMatchStructDetailAvailable();

    /**
     * 
     * @param idDetail
     * @return
     *     returns org.datacontract.schemas._2004._07.livemediastructs.ArrayOfMatchLightStruct
     */
    @WebMethod(operationName = "MatchLightStructList", action = "http://tempuri.org/IServiceAmiscoLive/MatchLightStructList")
    @WebResult(name = "MatchLightStructListResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "MatchLightStructList", targetNamespace = "http://tempuri.org/", className = "org.tempuri.MatchLightStructList")
    @ResponseWrapper(localName = "MatchLightStructListResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.MatchLightStructListResponse")
    public ArrayOfMatchLightStruct matchLightStructList(
        @WebParam(name = "idDetail", targetNamespace = "http://tempuri.org/")
        Integer idDetail);

    /**
     * 
     * @param idDetail
     * @param idMatch
     * @return
     *     returns org.datacontract.schemas._2004._07.livemediastructs.MatchStruct
     */
    @WebMethod(operationName = "GetMatchStruct", action = "http://tempuri.org/IServiceAmiscoLive/GetMatchStruct")
    @WebResult(name = "GetMatchStructResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetMatchStruct", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetMatchStruct")
    @ResponseWrapper(localName = "GetMatchStructResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetMatchStructResponse")
    public MatchStruct getMatchStruct(
        @WebParam(name = "idMatch", targetNamespace = "http://tempuri.org/")
        Integer idMatch,
        @WebParam(name = "idDetail", targetNamespace = "http://tempuri.org/")
        Integer idDetail);

    /**
     * 
     * @param idDetail
     * @param idMatchList
     * @return
     *     returns org.datacontract.schemas._2004._07.livemediastructs.ArrayOfMatchStruct
     */
    @WebMethod(operationName = "GetMatchStructList", action = "http://tempuri.org/IServiceAmiscoLive/GetMatchStructList")
    @WebResult(name = "GetMatchStructListResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetMatchStructList", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetMatchStructList")
    @ResponseWrapper(localName = "GetMatchStructListResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetMatchStructListResponse")
    public ArrayOfMatchStruct getMatchStructList(
        @WebParam(name = "idMatchList", targetNamespace = "http://tempuri.org/")
        ArrayOfint idMatchList,
        @WebParam(name = "idDetail", targetNamespace = "http://tempuri.org/")
        Integer idDetail);

    /**
     * 
     * @param idDetail
     * @param idMatch
     * @param idActor
     * @return
     *     returns org.datacontract.schemas._2004._07.livemediastructs.ActorStruct
     */
    @WebMethod(operationName = "GetActorStruct", action = "http://tempuri.org/IServiceAmiscoLive/GetActorStruct")
    @WebResult(name = "GetActorStructResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetActorStruct", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetActorStruct")
    @ResponseWrapper(localName = "GetActorStructResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetActorStructResponse")
    public ActorStruct getActorStruct(
        @WebParam(name = "idMatch", targetNamespace = "http://tempuri.org/")
        Integer idMatch,
        @WebParam(name = "idActor", targetNamespace = "http://tempuri.org/")
        Integer idActor,
        @WebParam(name = "idDetail", targetNamespace = "http://tempuri.org/")
        Integer idDetail);

    /**
     * 
     * @param idDetail
     * @param idTeam
     * @param idMatch
     * @return
     *     returns org.datacontract.schemas._2004._07.livemediastructs.TeamStruct
     */
    @WebMethod(operationName = "GetTeamStruct", action = "http://tempuri.org/IServiceAmiscoLive/GetTeamStruct")
    @WebResult(name = "GetTeamStructResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetTeamStruct", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetTeamStruct")
    @ResponseWrapper(localName = "GetTeamStructResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetTeamStructResponse")
    public TeamStruct getTeamStruct(
        @WebParam(name = "idMatch", targetNamespace = "http://tempuri.org/")
        Integer idMatch,
        @WebParam(name = "idTeam", targetNamespace = "http://tempuri.org/")
        Integer idTeam,
        @WebParam(name = "idDetail", targetNamespace = "http://tempuri.org/")
        Integer idDetail);

    /**
     * 
     * @param idMatchLFP
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "LfpGetMatchOldXmlContentC", action = "http://tempuri.org/IServiceAmiscoLive/LfpGetMatchOldXmlContentC")
    @WebResult(name = "LfpGetMatchOldXmlContentCResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "LfpGetMatchOldXmlContentC", targetNamespace = "http://tempuri.org/", className = "org.tempuri.LfpGetMatchOldXmlContentC")
    @ResponseWrapper(localName = "LfpGetMatchOldXmlContentCResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.LfpGetMatchOldXmlContentCResponse")
    public String lfpGetMatchOldXmlContentC(
        @WebParam(name = "idMatchLFP", targetNamespace = "http://tempuri.org/")
        Integer idMatchLFP);

    /**
     * 
     * @return
     *     returns com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring
     */
    @WebMethod(operationName = "GetMatchFilActionStructDetailAvailable", action = "http://tempuri.org/IServiceAmiscoLive/GetMatchFilActionStructDetailAvailable")
    @WebResult(name = "GetMatchFilActionStructDetailAvailableResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetMatchFilActionStructDetailAvailable", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetMatchFilActionStructDetailAvailable")
    @ResponseWrapper(localName = "GetMatchFilActionStructDetailAvailableResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetMatchFilActionStructDetailAvailableResponse")
    public ArrayOfKeyValueOfintstring getMatchFilActionStructDetailAvailable();

    /**
     * 
     * @param idDetail
     * @return
     *     returns org.datacontract.schemas._2004._07.livemediastructs.ArrayOfMatchFilActionLightStruct
     */
    @WebMethod(operationName = "MatchFilActionLightStructList", action = "http://tempuri.org/IServiceAmiscoLive/MatchFilActionLightStructList")
    @WebResult(name = "MatchFilActionLightStructListResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "MatchFilActionLightStructList", targetNamespace = "http://tempuri.org/", className = "org.tempuri.MatchFilActionLightStructList")
    @ResponseWrapper(localName = "MatchFilActionLightStructListResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.MatchFilActionLightStructListResponse")
    public ArrayOfMatchFilActionLightStruct matchFilActionLightStructList(
        @WebParam(name = "idDetail", targetNamespace = "http://tempuri.org/")
        Integer idDetail);

    /**
     * 
     * @param idDetail
     * @param idMatch
     * @return
     *     returns org.datacontract.schemas._2004._07.livemediastructs.MatchFilActionStruct
     */
    @WebMethod(operationName = "GetMatchFilActionStruct", action = "http://tempuri.org/IServiceAmiscoLive/GetMatchFilActionStruct")
    @WebResult(name = "GetMatchFilActionStructResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetMatchFilActionStruct", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetMatchFilActionStruct")
    @ResponseWrapper(localName = "GetMatchFilActionStructResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetMatchFilActionStructResponse")
    public MatchFilActionStruct getMatchFilActionStruct(
        @WebParam(name = "idMatch", targetNamespace = "http://tempuri.org/")
        Integer idMatch,
        @WebParam(name = "idDetail", targetNamespace = "http://tempuri.org/")
        Integer idDetail);

    /**
     * 
     * @param idDetail
     * @param idMatch
     * @return
     *     returns org.datacontract.schemas._2004._07.livemediastructs.ArrayOfMatchFilActionStruct
     */
    @WebMethod(operationName = "GetMatchFilActionStructList", action = "http://tempuri.org/IServiceAmiscoLive/GetMatchFilActionStructList")
    @WebResult(name = "GetMatchFilActionStructListResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetMatchFilActionStructList", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetMatchFilActionStructList")
    @ResponseWrapper(localName = "GetMatchFilActionStructListResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetMatchFilActionStructListResponse")
    public ArrayOfMatchFilActionStruct getMatchFilActionStructList(
        @WebParam(name = "idMatch", targetNamespace = "http://tempuri.org/")
        ArrayOfint idMatch,
        @WebParam(name = "idDetail", targetNamespace = "http://tempuri.org/")
        Integer idDetail);

    /**
     * 
     * @return
     *     returns com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring
     */
    @WebMethod(operationName = "GetDayScoringStructDetailAvailable", action = "http://tempuri.org/IServiceAmiscoLive/GetDayScoringStructDetailAvailable")
    @WebResult(name = "GetDayScoringStructDetailAvailableResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetDayScoringStructDetailAvailable", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetDayScoringStructDetailAvailable")
    @ResponseWrapper(localName = "GetDayScoringStructDetailAvailableResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetDayScoringStructDetailAvailableResponse")
    public ArrayOfKeyValueOfintstring getDayScoringStructDetailAvailable();

    /**
     * 
     * @param idDetail
     * @return
     *     returns org.datacontract.schemas._2004._07.livemediastructs.ArrayOfDayScoringStruct
     */
    @WebMethod(operationName = "DayScoringStructList", action = "http://tempuri.org/IServiceAmiscoLive/DayScoringStructList")
    @WebResult(name = "DayScoringStructListResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DayScoringStructList", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DayScoringStructList")
    @ResponseWrapper(localName = "DayScoringStructListResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DayScoringStructListResponse")
    public ArrayOfDayScoringStruct dayScoringStructList(
        @WebParam(name = "idDetail", targetNamespace = "http://tempuri.org/")
        Integer idDetail);

    /**
     * 
     * @return
     *     returns com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring
     */
    @WebMethod(operationName = "GetDayRankingStructDetailAvailable", action = "http://tempuri.org/IServiceAmiscoLive/GetDayRankingStructDetailAvailable")
    @WebResult(name = "GetDayRankingStructDetailAvailableResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetDayRankingStructDetailAvailable", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetDayRankingStructDetailAvailable")
    @ResponseWrapper(localName = "GetDayRankingStructDetailAvailableResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetDayRankingStructDetailAvailableResponse")
    public ArrayOfKeyValueOfintstring getDayRankingStructDetailAvailable();

    /**
     * 
     * @param idDetail
     * @return
     *     returns org.datacontract.schemas._2004._07.livemediastructs.ArrayOfDayRankingStruct
     */
    @WebMethod(operationName = "DayRankingStructList", action = "http://tempuri.org/IServiceAmiscoLive/DayRankingStructList")
    @WebResult(name = "DayRankingStructListResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DayRankingStructList", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DayRankingStructList")
    @ResponseWrapper(localName = "DayRankingStructListResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.DayRankingStructListResponse")
    public ArrayOfDayRankingStruct dayRankingStructList(
        @WebParam(name = "idDetail", targetNamespace = "http://tempuri.org/")
        Integer idDetail);

}
