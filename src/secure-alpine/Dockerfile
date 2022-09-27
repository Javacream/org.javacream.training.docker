FROM alpine

ENV USER=docker_user
ENV UID=12345

RUN addgroup "$USER"

RUN adduser \
    --disabled-password \
    --home "$(pwd)" \
    --ingroup "$USER" \
    --no-create-home \
    --uid "$UID" \
    ${USER}

USER "$USER"    
